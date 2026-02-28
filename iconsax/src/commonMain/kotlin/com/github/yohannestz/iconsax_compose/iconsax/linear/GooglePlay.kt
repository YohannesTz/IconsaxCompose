package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GooglePlay: ImageVector
    get() {
        val current = _googlePlay
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.GooglePlay",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.4f, y = 12.9f)
                lineToRelative(dx = -4.5f, dy = 2.3f)
                lineToRelative(dx = -3.2f, dy = -3.2f)
                lineToRelative(dx = 3.2f, dy = -3.2f)
                lineToRelative(dx = 4.5f, dy = 2.2f)
                curveToRelative(dx1 = 0.8f, dy1 = 0.4f, dx2 = 0.8f, dy2 = 1.6f, dx3 = 0.0f, dy3 = 1.9f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.9f, y = 8.8f)
                lineTo(x = 13.7f, y = 12.0f)
                lineToRelative(dx = -9.6f, dy = 9.6f)
                lineToRelative(dx = -0.6f, dy = 0.3f)
                curveToRelative(dx1 = -0.7f, dy1 = 0.4f, dx2 = -1.5f, dy2 = -0.2f, dx3 = -1.5f, dy3 = -1.0f)
                verticalLineTo(y = 3.1f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.8f, dx2 = 0.8f, dy2 = -1.3f, dx3 = 1.5f, dy3 = -1.0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.9f, y = 15.2f)
                lineTo(x = 4.1f, y = 21.6f)
                lineToRelative(dx = 9.6f, dy = -9.6f)
                close()
                moveTo(x = 13.7f, y = 12.0f)
                lineTo(x = 4.1f, y = 2.4f)
            }
        }.build().also { _googlePlay = it }
    }

@Suppress("ObjectPropertyName")
private var _googlePlay: ImageVector? = null
