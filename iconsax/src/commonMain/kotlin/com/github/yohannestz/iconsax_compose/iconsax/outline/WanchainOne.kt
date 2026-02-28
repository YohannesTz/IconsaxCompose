package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WanchainOne: ImageVector
    get() {
        val current = _wanchainOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.WanchainOne",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 18.73f, y = 21.75f)
                horizontalLineToRelative(dx = -6.46f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.04f, dy1 = -0.56f)
                lineToRelative(dx = -2.92f, dy = -4.38f)
                lineToRelative(dx = -2.26f, dy = 3.87f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.04f, dy1 = 0.62f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.08f, dy1 = -0.56f)
                lineToRelative(dx = -3.37f, dy = -5.06f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.39f)
                lineToRelative(dx = 3.67f, dy = -5.5f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.04f, dy1 = -0.56f)
                horizontalLineToRelative(dx = 4.93f)
                lineTo(x = 7.8f, y = 4.11f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.25f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.08f, dy1 = -0.63f)
                horizontalLineToRelative(dx = 6.84f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.08f, dy1 = 0.62f)
                lineToRelative(dx = 6.7f, dy = 11.48f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.04f, dy1 = 1.32f)
                lineToRelative(dx = -3.68f, dy = 5.52f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.05f, dy1 = 0.58f)
                moveToRelative(dx = -6.33f, dy = -1.5f)
                horizontalLineToRelative(dx = 6.2f)
                lineToRelative(dx = 3.52f, dy = -5.28f)
                lineToRelative(dx = -6.55f, dy = -11.22f)
                horizontalLineTo(x = 9.31f)
                lineToRelative(dx = 3.5f, dy = 6.0f)
                lineToRelative(dx = 2.4f, dy = 4.12f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.25f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.08f, dy1 = 0.63f)
                horizontalLineTo(x = 9.4f)
                close()
                moveTo(x = 1.9f, y = 15.0f)
                lineToRelative(dx = 3.06f, dy = 4.58f)
                lineToRelative(dx = 2.24f, dy = -3.83f)
                lineToRelative(dx = 3.5f, dy = -6.0f)
                horizontalLineTo(x = 5.41f)
                close()
                moveToRelative(dx = 7.91f, dy = -0.75f)
                horizontalLineToRelative(dx = 3.89f)
                lineToRelative(dx = -1.94f, dy = -3.33f)
                close()
            }
        }.build().also { _wanchainOne = it }
    }

@Suppress("ObjectPropertyName")
private var _wanchainOne: ImageVector? = null
