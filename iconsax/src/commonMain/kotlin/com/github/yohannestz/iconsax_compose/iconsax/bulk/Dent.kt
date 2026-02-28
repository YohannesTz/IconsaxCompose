package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Dent: ImageVector
    get() {
        val current = _dent
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Dent",
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
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.84f, y = 13.27f)
                lineToRelative(dx = -1.46f, dy = -0.84f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -0.87f)
                lineToRelative(dx = 1.46f, dy = -0.84f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.48f, dy1 = -1.8f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.8f, dy1 = -0.48f)
                lineToRelative(dx = -1.46f, dy = 0.84f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.43f)
                verticalLineTo(y = 7.17f)
                arcToRelative(a = 1.32f, b = 1.32f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -2.64f, dy1 = 0.0f)
                verticalLineToRelative(dy = 1.68f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.38f, dx2 = -0.42f, dy2 = 0.63f, dx3 = -0.75f, dy3 = 0.43f)
                lineTo(x = 8.46f, y = 8.44f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.8f, dy1 = 0.48f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.48f, dy1 = 1.8f)
                lineToRelative(dx = 1.46f, dy = 0.84f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 0.87f)
                lineToRelative(dx = -1.46f, dy = 0.84f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.48f, dy1 = 1.8f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.8f, dy1 = 0.48f)
                lineToRelative(dx = 1.46f, dy = -0.84f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = 0.43f)
                verticalLineToRelative(dy = 1.68f)
                arcToRelative(a = 1.32f, b = 1.32f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 2.64f, dy1 = 0.0f)
                verticalLineToRelative(dy = -1.68f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.38f, dx2 = 0.42f, dy2 = -0.63f, dx3 = 0.75f, dy3 = -0.43f)
                lineToRelative(dx = 1.46f, dy = 0.84f)
                arcToRelative(a = 1.32f, b = 1.32f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.32f, dy1 = -2.28f)
            }
        }.build().also { _dent = it }
    }

@Suppress("ObjectPropertyName")
private var _dent: ImageVector? = null
