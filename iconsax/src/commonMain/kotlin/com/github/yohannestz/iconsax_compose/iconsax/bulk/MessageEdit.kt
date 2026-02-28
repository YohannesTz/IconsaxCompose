package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessageEdit: ImageVector
    get() {
        val current = _messageEdit
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MessageEdit",
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
                moveTo(x = 16.0f, y = 2.0f)
                horizontalLineTo(x = 8.0f)
                quadTo(x1 = 2.0f, y1 = 2.0f, x2 = 2.0f, y2 = 8.0f)
                verticalLineToRelative(dy = 13.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = 1.0f)
                horizontalLineToRelative(dx = 13.0f)
                quadToRelative(dx1 = 6.0f, dy1 = 0.0f, dx2 = 6.0f, dy2 = -6.0f)
                verticalLineTo(y = 8.0f)
                quadToRelative(dx1 = 0.0f, dy1 = -6.0f, dx2 = -6.0f, dy2 = -6.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.55f, y = 7.46f)
                curveToRelative(dx1 = -1.26f, dy1 = -1.26f, dx2 = -2.48f, dy2 = -1.29f, dx3 = -3.77f, dy3 = 0.0f)
                lineTo(x = 12.0f, y = 8.25f)
                quadToRelative(dx1 = -0.1f, dy1 = 0.12f, dx2 = -0.07f, dy2 = 0.26f)
                arcToRelative(a = 5.2f, b = 5.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.58f, dy1 = 3.58f)
                lineToRelative(dx = 0.08f, dy = 0.01f)
                arcToRelative(a = 0.3f, b = 0.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.2f, dy1 = -0.08f)
                lineToRelative(dx = 0.77f, dy = -0.78f)
                quadToRelative(dx1 = 0.95f, dy1 = -0.95f, dx2 = 0.95f, dy2 = -1.87f)
                quadToRelative(dx1 = 0.01f, dy1 = -0.96f, dx2 = -0.95f, dy2 = -1.91f)
                moveToRelative(dx = -2.21f, dy = 5.21f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.95f, dy1 = -0.56f)
                lineToRelative(dx = -0.37f, dy = -0.28f)
                lineToRelative(dx = -0.11f, dy = -0.1f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.67f, dy1 = -0.67f)
                quadToRelative(dx1 = -0.03f, dy1 = -0.02f, dx2 = -0.09f, dy2 = -0.12f)
                lineToRelative(dx = -0.27f, dy = -0.35f)
                lineToRelative(dx = -0.25f, dy = -0.38f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.51f, dy1 = -1.09f)
                lineTo(x = 7.35f, y = 12.9f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.53f, dy1 = 1.05f)
                lineToRelative(dx = -0.29f, dy = 2.08f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.33f, dy1 = 1.13f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.9f, dy1 = 0.35f)
                quadToRelative(dx1 = 0.12f, dy1 = 0.0f, dx2 = 0.23f, dy2 = -0.02f)
                lineToRelative(dx = 2.08f, dy = -0.29f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.05f, dy1 = -0.53f)
                lineToRelative(dx = 3.77f, dy = -3.77f)
                close()
            }
        }.build().also { _messageEdit = it }
    }

@Suppress("ObjectPropertyName")
private var _messageEdit: ImageVector? = null
