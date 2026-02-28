package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BoxOne: ImageVector
    get() {
        val current = _boxOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BoxOne",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 21.04f, y = 7.19f)
                lineTo(x = 12.0f, y = 12.42f)
                lineTo(x = 2.96f, y = 7.19f)
                arcToRelative(a = 4.4f, b = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.63f, dy1 = -1.75f)
                lineToRelative(dx = 5.34f, dy = -2.96f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.14f, dy1 = 0.0f)
                lineToRelative(dx = 5.34f, dy = 2.96f)
                arcToRelative(a = 4.4f, b = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.63f, dy1 = 1.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.6f,
                strokeAlpha = 0.6f,
            ) {
                moveTo(x = 12.0f, y = 12.42f)
                verticalLineTo(y = 22.0f)
                arcToRelative(a = 4.3f, b = 4.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.07f, dy1 = -0.48f)
                lineToRelative(dx = -5.34f, dy = -2.96f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.2f, dy1 = -3.73f)
                verticalLineTo(y = 9.17f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.96f, y1 = 7.2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.61f, y = 9.17f)
                verticalLineToRelative(dy = 5.66f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.2f, dy1 = 3.73f)
                lineToRelative(dx = -5.34f, dy = 2.96f)
                arcTo(horizontalEllipseRadius = 4.3f, verticalEllipseRadius = 4.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.0f)
                verticalLineToRelative(dy = -9.58f)
                lineToRelative(dx = 9.04f, dy = -5.23f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.57f, dy1 = 1.98f)
            }
        }.build().also { _boxOne = it }
    }

@Suppress("ObjectPropertyName")
private var _boxOne: ImageVector? = null
