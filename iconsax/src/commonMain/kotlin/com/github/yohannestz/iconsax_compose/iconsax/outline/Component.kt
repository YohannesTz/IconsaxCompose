package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Component: ImageVector
    get() {
        val current = _component
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Component",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.75f)
                arcToRelative(a = 4.3f, b = 4.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.08f, dy1 = -1.27f)
                lineToRelative(dx = -6.39f, dy = -6.39f)
                arcToRelative(a = 4.3f, b = 4.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.27f, dy1 = -3.08f)
                arcToRelative(a = 4.3f, b = 4.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.27f, dy1 = -3.08f)
                lineToRelative(dx = 6.39f, dy = -6.39f)
                arcToRelative(a = 4.33f, b = 4.33f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 6.16f, dy1 = 0.0f)
                lineToRelative(dx = 6.39f, dy = 6.39f)
                arcToRelative(a = 4.33f, b = 4.33f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 6.16f)
                lineToRelative(dx = -6.39f, dy = 6.39f)
                arcTo(horizontalEllipseRadius = 4.3f, verticalEllipseRadius = 4.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.75f)
                moveToRelative(dx = 0.0f, dy = -20.0f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.02f, dy1 = 0.83f)
                lineTo(x = 3.59f, y = 9.97f)
                arcToRelative(a = 2.86f, b = 2.86f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.04f)
                lineToRelative(dx = 6.39f, dy = 6.39f)
                arcToRelative(a = 2.94f, b = 2.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.04f, dy1 = 0.0f)
                lineToRelative(dx = 6.39f, dy = -6.39f)
                curveToRelative(dx1 = 0.54f, dy1 = -0.54f, dx2 = 0.83f, dy2 = -1.25f, dx3 = 0.83f, dy3 = -2.02f)
                reflectiveCurveToRelative(dx1 = -0.3f, dy1 = -1.49f, dx2 = -0.83f, dy2 = -2.02f)
                lineToRelative(dx = -6.39f, dy = -6.39f)
                arcTo(horizontalEllipseRadius = 2.8f, verticalEllipseRadius = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 2.75f)
            }
        }.build().also { _component = it }
    }

@Suppress("ObjectPropertyName")
private var _component: ImageVector? = null
