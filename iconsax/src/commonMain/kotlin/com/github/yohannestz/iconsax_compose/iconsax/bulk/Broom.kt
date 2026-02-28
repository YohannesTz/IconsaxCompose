package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Broom: ImageVector
    get() {
        val current = _broom
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Broom",
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
                moveTo(x = 9.83f, y = 5.57f)
                lineTo(x = 6.36f, y = 7.68f)
                lineToRelative(dx = -1.58f, dy = -2.6f)
                arcToRelative(a = 2.03f, b = 2.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.47f, dy1 = -2.1f)
                close()
                moveToRelative(dx = 9.44f, dy = 12.07f)
                lineToRelative(dx = -0.01f, dy = 0.01f)
                lineToRelative(dx = -1.3f, dy = 0.79f)
                lineToRelative(dx = -1.3f, dy = 0.79f)
                lineToRelative(dx = -1.3f, dy = 0.79f)
                lineToRelative(dx = -1.3f, dy = 0.79f)
                lineToRelative(dx = -1.3f, dy = 0.79f)
                horizontalLineToRelative(dx = -0.01f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.6f, dy1 = -1.05f)
                lineToRelative(dx = -2.08f, dy = -4.24f)
                arcToRelative(a = 4.05f, b = 4.05f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.53f, dy1 = -5.26f)
                lineToRelative(dx = 3.21f, dy = -1.95f)
                arcToRelative(a = 4.01f, b = 4.01f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.37f, dy1 = 1.05f)
                lineToRelative(dx = 2.81f, dy = 3.8f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.72f, dy1 = 3.69f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.9f, y = 8.66f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.09f, dy1 = 0.46f)
                lineTo(x = 8.6f, y = 11.07f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.91f, dy1 = 0.75f)
                horizontalLineTo(x = 7.68f)
                lineTo(x = 6.03f, y = 9.07f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.36f, y1 = 7.7f)
                lineToRelative(dx = 3.47f, dy = -2.1f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.39f, dy1 = 0.32f)
                lineToRelative(dx = 1.66f, dy = 2.73f)
                close()
                moveToRelative(dx = 3.76f, dy = 10.57f)
                lineToRelative(dx = -1.3f, dy = 0.79f)
                lineToRelative(dx = -1.67f, dy = -2.75f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.25f, dy1 = -1.05f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.05f, dy1 = 0.25f)
                close()
                moveToRelative(dx = -2.6f, dy = 1.59f)
                lineToRelative(dx = -1.3f, dy = 0.79f)
                lineToRelative(dx = -1.67f, dy = -2.75f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.25f, dy1 = -1.05f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.05f, dy1 = 0.25f)
                close()
                moveToRelative(dx = 5.2f, dy = -3.17f)
                lineToRelative(dx = -1.3f, dy = 0.8f)
                lineToRelative(dx = -1.67f, dy = -2.76f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.25f, dy1 = -1.05f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.05f, dy1 = 0.25f)
                close()
            }
        }.build().also { _broom = it }
    }

@Suppress("ObjectPropertyName")
private var _broom: ImageVector? = null
