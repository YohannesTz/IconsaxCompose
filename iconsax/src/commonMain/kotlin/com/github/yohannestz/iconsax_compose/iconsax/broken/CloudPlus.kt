package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudPlus: ImageVector
    get() {
        val current = _cloudPlus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CloudPlus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.97f, y = 20.0f)
                horizontalLineToRelative(dx = -4.0f)
                moveToRelative(dx = 2.0f, dy = 2.0f)
                verticalLineToRelative(dy = -4.0f)
                moveTo(x = 12.0f, y = 3.98f)
                curveToRelative(dx1 = -4.0f, dy1 = -0.34f, dx2 = -8.34f, dy2 = 3.11f, dx3 = -6.38f, dy3 = 8.58f)
                moveTo(x = 16.6f, y = 20.0f)
                arcToRelative(a = 5.3f, b = 5.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.62f, dy1 = -1.39f)
                curveToRelative(dx1 = 3.27f, dy1 = -2.86f, dx2 = 1.52f, dy2 = -8.6f, dx3 = -2.79f, dy3 = -9.14f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.48f, dy1 = -3.45f)
                moveToRelative(dx = -8.68f, dy = 6.95f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.71f, dy1 = -0.4f)
                curveToRelative(dx1 = -4.66f, dy1 = 0.33f, dx2 = -4.65f, dy2 = 7.11f, dx3 = 0.0f, dy3 = 7.44f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.82f, y = 9.89f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.66f, dy1 = -0.41f)
            }
        }.build().also { _cloudPlus = it }
    }

@Suppress("ObjectPropertyName")
private var _cloudPlus: ImageVector? = null
