package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MirroringScreen: ImageVector
    get() {
        val current = _mirroringScreen
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MirroringScreen",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.0f, y = 3.0f)
                horizontalLineTo(x = 7.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.0f, dy1 = 5.0f)
                verticalLineToRelative(dy = 8.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.0f, dy1 = 5.0f)
                horizontalLineToRelative(dx = 10.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.0f, dy1 = -5.0f)
                verticalLineTo(y = 8.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.0f, dy1 = -5.0f)
                moveToRelative(dx = -6.51f, dy = 13.81f)
                lineToRelative(dx = -0.1f, dy = 0.01f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.74f, dy1 = -0.65f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.89f, dy1 = -1.89f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.65f, dy1 = -0.84f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.84f, dy1 = -0.65f)
                arcToRelative(a = 3.65f, b = 3.65f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.19f, dy1 = 3.19f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.65f, dy1 = 0.83f)
                moveToRelative(dx = 3.05f, dy = -0.51f)
                lineToRelative(dx = -0.1f, dy = 0.01f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.74f, dy1 = -0.65f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.43f, dy1 = -4.43f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.65f, dy1 = -0.84f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.84f, dy1 = -0.65f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.73f, dy1 = 5.73f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.65f, dy1 = 0.83f)
                moveToRelative(dx = 2.7f, dy = -0.87f)
                lineToRelative(dx = -0.1f, dy = 0.01f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.74f, dy1 = -0.65f)
                arcToRelative(a = 7.06f, b = 7.06f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -6.27f, dy1 = -6.27f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.65f, dy1 = -0.84f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.84f, dy1 = -0.65f)
                arcToRelative(a = 8.55f, b = 8.55f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 7.57f, dy1 = 7.57f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.65f, dy1 = 0.83f)
            }
        }.build().also { _mirroringScreen = it }
    }

@Suppress("ObjectPropertyName")
private var _mirroringScreen: ImageVector? = null
