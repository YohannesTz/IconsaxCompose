package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowDownTwo: ImageVector
    get() {
        val current = _arrowDownTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrowDownTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 16.8f)
                curveToRelative(dx1 = -0.7f, dy1 = 0.0f, dx2 = -1.4f, dy2 = -0.27f, dx3 = -1.93f, dy3 = -0.8f)
                lineTo(x = 3.55f, y = 9.48f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                lineToRelative(dx = 6.52f, dy = 6.52f)
                arcToRelative(a = 1.23f, b = 1.23f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.74f, dy1 = 0.0f)
                lineToRelative(dx = 6.52f, dy = -6.52f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                lineTo(x = 13.93f, y = 16.0f)
                arcTo(horizontalEllipseRadius = 2.7f, verticalEllipseRadius = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 16.8f)
            }
        }.build().also { _arrowDownTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowDownTwo: ImageVector? = null
