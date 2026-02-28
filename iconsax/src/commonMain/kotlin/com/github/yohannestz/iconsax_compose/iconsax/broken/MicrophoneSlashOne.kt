package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MicrophoneSlashOne: ImageVector
    get() {
        val current = _microphoneSlashOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MicrophoneSlashOne",
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
                moveTo(x = 16.0f, y = 6.3f)
                verticalLineTo(y = 6.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -8.0f, dy1 = 0.0f)
                verticalLineToRelative(dy = 5.0f)
                moveToRelative(dx = 1.04f, dy = 3.19f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.0f, y1 = 11.5f)
                verticalLineTo(y = 11.0f)
                moveToRelative(dx = 2.72f, dy = 4.02f)
                arcToRelative(a = 7.6f, b = 7.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.93f, dy1 = -3.67f)
                verticalLineToRelative(dy = -1.7f)
                moveToRelative(dx = -12.87f, dy = 7.3f)
                arcTo(horizontalEllipseRadius = 7.7f, verticalEllipseRadius = 7.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 19.0f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.31f, dy1 = -0.75f)
                moveTo(x = 4.35f, y = 9.65f)
                verticalLineToRelative(dy = 1.7f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.6f, dy1 = 2.98f)
                moveTo(x = 20.07f, y = 2.84f)
                lineTo(x = 3.93f, y = 18.99f)
                moveTo(x = 11.0f, y = 3.0f)
                verticalLineToRelative(dy = 3.0f)
                moveToRelative(dx = 1.0f, dy = 13.0f)
                verticalLineToRelative(dy = 3.0f)
            }
        }.build().also { _microphoneSlashOne = it }
    }

@Suppress("ObjectPropertyName")
private var _microphoneSlashOne: ImageVector? = null
