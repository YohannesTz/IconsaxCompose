package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MicrophoneSlash: ImageVector
    get() {
        val current = _microphoneSlash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MicrophoneSlash",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 6.0f, y = 12.0f)
                verticalLineToRelative(dy = 1.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.46f, dx2 = 0.52f, dy2 = 2.8f, dx3 = 1.39f, dy3 = 3.84f)
                moveTo(x = 17.82f, y = 6.53f)
                arcTo(horizontalEllipseRadius = 6.0f, verticalEllipseRadius = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 2.0f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -6.0f, dy1 = 6.0f)
                moveToRelative(dx = 12.0f, dy = 1.98f)
                verticalLineTo(y = 13.0f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -8.08f, dy1 = 5.63f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 5.86f, y = 19.58f)
                arcTo(horizontalEllipseRadius = 9.0f, verticalEllipseRadius = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 21.0f, y1 = 13.0f)
                verticalLineToRelative(dy = -2.0f)
                moveToRelative(dx = 0.5f, dy = -8.01f)
                lineToRelative(dx = -19.0f, dy = 19.0f)
                moveTo(x = 11.55f, y = 5.5f)
                verticalLineTo(y = 2.26f)
                moveTo(x = 8.5f, y = 3.5f)
                verticalLineToRelative(dy = 4.0f)
            }
        }.build().also { _microphoneSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _microphoneSlash: ImageVector? = null
