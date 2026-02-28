package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FlashCircle: ImageVector
    get() {
        val current = _flashCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FlashCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.07f, y = 18.17f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.41f, dy1 = -1.4f)
                verticalLineToRelative(dy = -3.3f)
                horizontalLineTo(x = 8.68f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.05f, dy1 = -2.32f)
                lineToRelative(dx = 4.26f, dy = -4.84f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.54f, dy1 = -0.38f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.91f, dy1 = 1.31f)
                verticalLineToRelative(dy = 3.3f)
                horizontalLineToRelative(dx = 0.99f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.05f, dy1 = 2.32f)
                lineToRelative(dx = -4.26f, dy = 4.84f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.05f, dy1 = 0.47f)
                moveToRelative(dx = -2.17f, dy = -6.2f)
                horizontalLineToRelative(dx = 1.51f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = 0.75f)
                verticalLineToRelative(dy = 3.78f)
                lineToRelative(dx = 3.94f, dy = -4.47f)
                horizontalLineToRelative(dx = -1.51f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineTo(y = 7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.97f, y = 22.75f)
                curveTo(x1 = 6.05f, y1 = 22.75f, x2 = 1.22f, y2 = 17.93f, x3 = 1.22f, y3 = 12.0f)
                reflectiveCurveTo(x1 = 6.05f, y1 = 1.25f, x2 = 11.97f, y2 = 1.25f)
                reflectiveCurveTo(x1 = 22.72f, y1 = 6.07f, x2 = 22.72f, y2 = 12.0f)
                reflectiveCurveTo(x1 = 17.9f, y1 = 22.75f, x2 = 11.97f, y2 = 22.75f)
                moveToRelative(dx = 0.0f, dy = -20.0f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 18.5f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -18.5f)
            }
        }.build().also { _flashCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _flashCircle: ImageVector? = null
