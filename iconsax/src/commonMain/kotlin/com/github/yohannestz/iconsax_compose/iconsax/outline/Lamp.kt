package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lamp: ImageVector
    get() {
        val current = _lamp
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Lamp",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.78f, y = 19.34f)
                horizontalLineTo(x = 3.22f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineToRelative(dy = -4.94f)
                arcToRelative(a = 9.5f, b = 9.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 9.47f, dy1 = -9.47f)
                horizontalLineToRelative(dx = 0.12f)
                arcToRelative(a = 9.5f, b = 9.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 9.47f, dy1 = 9.47f)
                verticalLineToRelative(dy = 4.94f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
                moveToRelative(dx = -16.81f, dy = -1.5f)
                horizontalLineToRelative(dx = 16.06f)
                verticalLineToRelative(dy = -4.19f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.4f, dx2 = -3.58f, dy2 = -7.97f, dx3 = -7.97f, dy3 = -7.97f)
                horizontalLineToRelative(dx = -0.12f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -7.97f, dy1 = 7.97f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 5.68f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineTo(y = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 12.75f, y1 = 1.59f, x2 = 12.75f, y2 = 2.0f)
                verticalLineToRelative(dy = 2.93f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 5.68f)
                moveToRelative(dx = 0.0f, dy = 17.07f)
                arcToRelative(a = 4.43f, b = 4.43f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.4f, dy1 = -4.11f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.2f, dy1 = -0.56f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.55f, dy1 = -0.24f)
                horizontalLineToRelative(dx = 7.3f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = 0.8f)
                arcToRelative(a = 4.43f, b = 4.43f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.4f, dy1 = 4.11f)
                moveToRelative(dx = -2.73f, dy = -3.41f)
                arcTo(horizontalEllipseRadius = 2.9f, verticalEllipseRadius = 2.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 21.25f)
                arcToRelative(a = 2.9f, b = 2.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.73f, dy1 = -1.91f)
                close()
            }
        }.build().also { _lamp = it }
    }

@Suppress("ObjectPropertyName")
private var _lamp: ImageVector? = null
